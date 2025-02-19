package com.evvo.agent

import scala.concurrent.duration._

/**
  * A strategy, for how often each agent should run its step of the mutation process.
  * Given some information, returns how long to wait between each invocation of the
  * agent's task.
  */
trait TAgentStrategy {
  // TODO returning a duration is arbitrary, find a better calling API/return type
  def waitTime(populationInformation: TPopulationInformation): Duration
}

/**
  * Information about the population: meant to be used in communication
  * between the population and strategies of agents. Provides enough information
  * for agents to base their decisions on.
  */
trait TPopulationInformation {
  def numSolutions: Int
}

case class PopulationInformation(numSolutions: Int) extends TPopulationInformation
